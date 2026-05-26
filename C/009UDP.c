#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

#define PORT 8080
#define BUFFER_SIZE 1024

int main() {
    int sockfd;
    char buffer[BUFFER_SIZE];
    struct sockaddr_in server_addr, client_addr;
    
    // 1. Socket oluşturma
    // AF_INET: IPv4
    // SOCK_DGRAM: UDP kullanacağımızı belirtir (TCP için SOCK_STREAM olurdu)
    if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
        perror("Socket oluşturulamadı");
        exit(EXIT_FAILURE);
    }

    // 2. Adres yapısını doldurma
    memset(&server_addr, 0, sizeof(server_addr));
    memset(&client_addr, 0, sizeof(client_addr));

    server_addr.sin_family = AF_INET; // IPv4
    server_addr.sin_addr.s_addr = INADDR_ANY; // Herhangi bir arayüzden gelen veriyi kabul et
    server_addr.sin_port = htons(PORT); // Port numarası

    // 3. Socketi porta bağlama (Bind)
    if (bind(sockfd, (const struct sockaddr *)&server_addr, sizeof(server_addr)) < 0) {
        perror("Bind hatası");
        exit(EXIT_FAILURE);
    }

    printf("UDP Sunucu %d portunda dinliyor...\n", PORT);

    int n;
    socklen_t len = sizeof(client_addr);

    // 4. Veri bekleme ve alma
    // recvfrom: Veriyi alırken gönderenin adresini de (client_addr) kaydeder.
    n = recvfrom(sockfd, (char *)buffer, BUFFER_SIZE, MSG_WAITALL, 
                (struct sockaddr *) &client_addr, &len);
    
    buffer[n] = '\0'; // String sonlandırıcı ekle
    printf("İstemciden gelen mesaj: %s\n", buffer);

    // 5. Cevap gönderme
    // sendto: Cevabı direkt olarak client_addr adresine gönderir.
    char *hello = "Merhaba! Mesajını aldım.";
    sendto(sockfd, (const char *)hello, strlen(hello), MSG_CONFIRM, 
           (const struct sockaddr *) &client_addr, len);
    
    printf("Cevap gönderildi.\n");

    close(sockfd);
    return 0;
}