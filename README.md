## Chat local desenvolvido com sockets UDP em Java.
O chat desenvolvido tem como objetivo a troca de mensagens entre 2 computadores em uma rede local.

###  Baixe e teste o aplicativo:
[Clique aqui](http://www.google.com)

Para executar o .jar é necessario ter o [java](https://www.java.com/pt-BR/download/manual.jsp) instalado.

### Testar no mesmo computador
O software abre uma porta no seu computador, então se você abrir duas instancias e colocar a mesma porta nas duas não irá funcionar pois a segunda instancia vai tentar abrir a porta que já está em uso, então para testar no mesmo computador coloque portas diferentes nas portas remotas e local, no IP coloque localhost ou 127.0.0.1 . Siga o exemplo abaixo:

![enter image description here](https://raw.githubusercontent.com/kleber0a0m/links-youtube/main/imagens/h3rw7qyu.PNG)

### Testar em computadores diferentes
Abra o aplicativo nos dois computadores, caso queira coloque a mesma porta em ambos, tenha certeza que  que as portas não estão em uso, no IP coloque endereço do computador que irá receber as mensagens, caso queira mandar para todos da rede coloque o ip de broadscast, que no exemplo é 192.168.0.255.
Siga o exemplo abaixo:
 
![enter image description here](https://raw.githubusercontent.com/kleber0a0m/links-youtube/main/imagens/2yzqwcag.png)
