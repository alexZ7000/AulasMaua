# O que é  uma Máquina Virtual?

> É um ambiente isolado aonde se tem um novo sistema operacional instalado
> Vantagens:
1. Caso pegue um vírus, ele nunca chegará na máquina host
2. Ambiente de Testes
3. Pode rodar várias instâncias
4. Pode salvar um snapshot da VM

# Porque Linux?
> Pois é um software livre (significa que podemos manipular o S.O ao nosso prazer), sendo open-source e de graça

# O que é NAT?
> De uma maneira simples é uma rede privada que consegue se conectar a internet como se fosse uma rede púliba, por isso para fazer duas VMs conversarem você precisa habilitar o NAT nelas

# 5 Estágios antes de fazer uma penetração
> **Lembre-se que você não pode simplesmente atacar qualquer alvo, você precisa ter permissão explícita para realizar o ataque**

1. Reconhecimento = É a coleta de informações, e é o único estágio de penetração que você pode fazer em qualquer alvo. E vocẽ pode fazer isso de duas maneiras, interagindo diretamente com seu alvo ou passivamente, sem interagir com seu alvo como stalkear alguém no facebook

2. Scanning = É uma forma mais profunda de coleta de informações, aonde se descobre vulnerabilidades do alvo, logicamente não pode ser feito sem permissão

3. Exploitation = Aqui se ganha o acesso do sistema, aqui você já hackeou seu alvo, e agora você consegue roubar as informações dentro dele

4. Mantendo o acesso = Opcional, aqui se instala back doors ou root kits no alvo, que são programas simples que vão garantir nosso acesso novamente a qualquer novamente, sem a necessidade de fazer um novo exploit

5.  Apagar rastros = Remova todas as evidências de seu ataque, faça-o passar despercebido, faça-o parecer jamais ter ocorrido

# O que é um terminal?
> É um programa que permite a gente interagir com o sistema operacional

# IP e MAC
> **Endereço IP fala aonde você está. Endereço MAC fala quem é você**

# Pra que serve as pastas do linux?
> *https://www.linuxfoundation.org/blog/blog/classic-sysadmin-the-linux-filesystem-explained*

# Coletando informações de forma:
1. Ativa = Extraindo informações do alvo interagindo diretamente com ele
2. Passiva = Extraindo informações do alvo sem interagir com ele diretamente
> **Importante ressaltar que a forma ativa é mais eficiente, você irá conseguir mais informações usando a forma ativa**

# Mas o que devo procurar?
1. Endereço IP, para identificar seu alvo
2. E-mails ou celulares dos empregados, caso você esteja testando uma empresa
3.  Tecnologias, saber quantas redes tem, se há algum site no ar, servidores etc...

# Como identificar?
> ping nomeDoSite, assim você será capaz de pegar o endereço IP
**whois IPdoAlvo**
**whatweb endereço --verbose**
Latitude: -23.6283
Longitude: -46.6409

# O que é netmask?
> O último octeto da máscara de rede define que o ultimo numero  do nosso ip pode mudar

# COMANDOS PARA COLETA DE INFORMAÇÕES
1. ifconfig (para ver informações de rede da sua máquina)
2. ping <url> (para pegar o IP do servidor)
3.  whois <url> (para ver informações a respeito da url)
4.  whatweb <url> -v (para ver informações detalhadas sobre o servidor)
5. php rhawk.php (ver informações detalhadíssimas sobre o servidor)
6. theHarvester -d <url> (para rastrear e-mails)
7. hunter.io (site para rastrear e-mails)
8. arquivo email-scrapper (código em python que rastreia e-mails)
9. python3 sherlock <username> (tem que ser rodado na pasta sherlock)


***

#Hash
A utilidade do hash é para verificar a integridade do arquivo, caso o hash do arquivo seja diferente do original significa que o arquivo foi modificado, e sua integridade fica comprometida

echo -n "alice" | md5sum
hash-identifier

#Método de força bruta
Com o hash de senha

1. john --help
2.  wc -l /usr/share/john/password.lst (para ver a quantidade de senhas guardadas)
3. john --show --format=raw-sha1 hash.txt
4. john --format=raw-sha1 --wordlist=/usr/share/wordlists/rockyou.txt hash.txt
5. echo conteudo > file.txt (para criar um arquivo)
   steganografia

cifra e hash são coisas diferentes
palindromo é o texto invertido

vamos deixar duas máquinas virtuais rodando uma metapoistable2 e outra kali linux, sendo host-only e NAT respectivamente
metaploistable 2 já tem um serviço web incorporado

ao entrar no metapoistable2 você vai rodar os seguintes comandos

sudo su
dhclient eth1 (caso você escolher como adaptador 2)
tail -f /var/log/apache2/access.log (comando para ver o log do servidor web)


comandos no kali linux
sudo su
ifconfig (para ver todos os dhclient)
dhclient eth0
dhclient eth1 (a gnt coloca os dois comandos porque o kali acessa o web do metasploit2)
nmap <ipDaMaquinaAlvo> (comando para ver as portas disponíveis no servidor)
curl -I ipdousuario (manda um get para o servidor, pegando as informações da rota get)
head -n1 nomedoarquivo.log (Para ler a primeira linha do arquivo)
tail -n1 nomedoarquivo.log (Para ler a última linha do arquivo)
cat nomedoarquivo.log | cut -d " " -f 1 (cut é um comando que vai filtrar minha pesquisa pegando apenas os dados que vou usar)
cat nomedoarquivo.log | cut -d " " -f 1  | sort | uniq -c (comando que só vai listar os ips únicos)
cat nomedoarquivo.log | grep "IPDaMaquinaALvo" (busca informações desse IP)
cat nomedoarquivo.log | grep "IPDaMaquinaALvo" | grep "Nmap" (Nmap, Nikto, Nessus)


comandos wireshark
ftp-data para pegar os dados
ftp.port==21 especificar a porta
nmap -sV -p 80 192.

telnet
http
ftp

.pcap = extensão de arquivo de captura de pacotes, conseguindo ler tudo que passa na placa de rede, normalmente lida por sniffers de rede (como o wireshark)

# Markdown
1. Numbered Lists
* Unnumbered and [Links](https://gnome.org)
* `Preformatted Text`
* _Emphasis_ or *Emphasis* **Combined**
> Block quotes too!