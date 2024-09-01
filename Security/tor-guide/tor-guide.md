**# O que é o Tor?
> Desenvolvido pelo exército americano para proteger suas comunicações, o Tor é uma rede de servidores que buscam melhorar o anonimato e privacidade

# O Google sabe muito sobre você
> Ao usar o mecanismo de buscas do google, além de toda aquela informação que seu computador já disponibiliza para ele só de entrar no site, o google também é capaz de ver tudo o que você pesquisa e tudo o que você já pesquisou antes, e não só isso ele também consegue acessar sua atividade em outros sites, vendendo você para anunciantes te oferecerem produtos, e montar um estudo de seu comportamento e com isso ele sabe exatamente o que procura, e não somente o que você procura, mas o que você procura na hora certa, ele cria um radar ao redor de você mapeando tudo o que vocẽ faz, estudando você por completo (esses exemplos servem para todas grandes empresas, facebook, amazon...)

>  Todos os sites que tem um botãozinho do google ou do Facebook, tem um código do google/facebook rodando em seus sites, e eles usam isso para ver quais sites você visita, e eles também conseguem ver informações sobre usuários privados no facebook

# Perfis Fantasma do Facebook
> Mesmo que você não tenha uma conta no facebook, provavelmente tenha uma conta sobre você lá, com todo seu padrão de comportamento, e eles vão adicionar seu nome ou algum outro método para te identificar, para poder reunir todas as informações sobre você naquele lugar.

> **Mas lembre-se, isso é apenas o que é reportado, imagine o que não é reportado, o que acontece debaixo dos panos sem ninguém ficar sabendo**

# Encebolamento Tor
> Ao tentar entrar em algum site, o Tor vai te jogar para 3 servidores diferentes e aleatórios, e nesses esses servidores estão outros milhares de usuários fazendo qualquer outra coisa, ou seja, esses servidores resolvem milhares de requisições, por isso é muito difícil saber de onde essa requisição veio, ou quem exatamente fez essa requisição

> Ao fazer uma requisição você manda informação desencriptada, e quando chega no servidor Tor ele encripta a informação e manda pro segundo servidor, o segundo servidor mantém a criptografia e manda para o terceiro servidor, e quando o terceiro servidor vai enviar a informação para o site, ele desencripta a informação e manda para o site, ou seja os únicos momentos em que a requisição não é encriptada é antes de chegar no primeiro servidor Tor e quando a requisição chega no site

> A informação final só será encriptada se o site possuir https ou um certificado SSL, sendo assim, o único momento em que a informação não é encriptada é quando a informação é enviada para o Tor, mas mesmo assim seu provedor de internet não é capaz de ver o que você está fazendo na rede Tor, ele apenas consegue ver que você está usando a rede Tor

> Usando uma VPN resolve o problema, fazendo com que a comunicação com o primeiro servidor Tor seja criptografada, mas ai surge outros problemas, como a VPN não ser confiável e honesta e guardar registros da sua navegação e compartilhar-la com terceiros além de reduzir sua velocidade de conexão

> Nenhuma parte do nó com exceto o guard (primeiro servidor) sabe de onde veio a requisição

# Acessar Serviços .onion
> Aqui a história é diferente, em vez do terceiro nó sair e ir pra internet, ele fica na rede Tor e de lá você simplesmente vai para o serviço .onion, mas a conexão para um serviço onion é feita de forma bem complexa

> Ao se conectar em um serviço .onion você não será capaz de ver/ter nenhuma informação sobre ele, e o mesmo vale para o serviço onion, ele não poderá pegar sua localização, nada que identifique vocẽ. Tudo isso é feito em ordem de proteger a privacidade a anonimidade dos dois lados do servidor

# Como se conectar a uma rede Tor
> Você pode configurar seu computador para fazer ele navegar somente usando a rede Tor

> As outras pessoas também podem fazer com que o computador delas virem um servidor da rede Tor, ou seja o último nó pode ser no pc de outra pessoa, justamente aonde a conexão não é criptografada, e você terá que confiar naquela pessoa toda a saída de seus dados

# Aprofundando no que exatamente é o Tor
> É uma versão modificada do Firefox ESR, configurado para fazer com que todo o tráfego da rede passe pela rede Tor, fazendo com que fiquemos mais anônimos e com mais privacidade. O Tor recebe atualizações constantes sobre todas as vulnerabilidades conhecidas, para ter certeza que ele é o mais seguro possível, também vem com alguns plugins desativados e outros plugins ativados, tudo para ter mais anonimato, privacidade e segurança

> Por padrão ele vem com um plugin que desativa o JavaScript nos sites, para você ficar anônimo

# Porque verificar a instalação de um programa?
> Ao instalar qualquer coisa da internet, o arquivo instalado sai do servidor do site, passa pelo seu provedor de internet (ISP), depois passa pelo administrador da sua rede local e finalmente chega até você. Em cada trecho do caminho que seu arquivo percorre ele pode ser modificado, seja por hackers ou pelo ISP

**TESTAR SE O TOR ESTÁ FUNCIONANDO = https://check.torproject.org**

# O que são as pontes?
> Pontes é a injeção de dados na rede para camuflar para seu ISP que você está acessando a rede Tor, tornando sua conexão mais lenta

# O que são fingerprints?
> Fingerprint é uma técnica de rastreamento para deixar o seu navegador o mais único possível, meio que criando um codinome para você e me identificando pelo codinome**