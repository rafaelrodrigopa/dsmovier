<h1><p align="center">dsmovier</p></h1>
  <p>Web App de avaliação de Filmes => <a href="https://rafals-dsmovie.netlify.app/">Aplicação com front rodando no netlify e back no heroku</a></p>

<h2>Índice</h2>
<ul>
  <li><a href="#aqui">Stack</a></li>
  <li><a href="#teste">Faça seus testes</a></li>
  <li><a href="#creditos">Creditos</a></li>
</ul>



<br />




<p align="center"><img src="https://user-images.githubusercontent.com/27809524/168373857-fc6991eb-2d0f-48c0-aaee-44bdbf23602d.png"></p>


<a name="aqui">
  
  <pre><code>
    <h2>Stack:</h2>
      Front End
      
           function React(React Hooks, Axios) => {
                return Netlify: <a href="https://rafals-dsmovie.netlify.app/">https://rafals-dsmovie.netlify.app/</a>
           }
           
      Backend
      
          public Hospedagem getBackend(Spring boot, Maven, H2 Database) {
                
                private test = H2 Database;
                private dev  = PostgresSQL;
                private prod = heroku.PostgresSQL;
                Clone o projeto
                return heroku.<a href="">https://rafals-dsmovie.herokuapp.com/</a>
                
          }
     
     Banco de dados
     
          select * from PostgresSQL
     
</code></pre>
  
<a>
<a name="teste">
  
  <h2>Faça seus testes</h2>
  
  <p><b>#01</b> Clone o projeto em uma pasta qualquer</p>
  <pre><code>git clone https://github.com/rafaelrodrigopa/dsmovier.git</code></pre>
 
  
  <p><b>#02 (Backend) </b> Com o Spring Tool Suite instalado, abra-o escolhendo a pasta do projeto como workspace</p>
  Em seguida:
    File > import > Maven > Existing Maven Projects > Finish (O projeto dsmovier será selecionado e o maven irá baixar todas as dependencias, basta apenas aguardar)
  
    Dar um (Re) start no projeto para roda

  <p><b>#02 (Banco) </b> Rodar o projeto no spring com o perfil dev e as seguintes linhas descomentadas</p>
  
 ![image](https://user-images.githubusercontent.com/27809524/168381812-7bc3933e-c9c9-43c4-8ee8-5010d22a1332.png)

 com isso um arquivo sql de criação do banco e seed será criado na pasta backend basta copiar e criar o banco de dados no pgadmin e depois rodar o projeto spring com as mesmas linhas comentadas
  
  <p><b>#04 (Frontend) </b> Com o node LTS, npm e yarn instaldo basta apenas entrar na pasta frontend do projeto e digitar os comando abaixo</p>
  
     Resolver as dependencias: yarn install ou npm install
     Rodar o projeto: yarn start ou npm start
  
</a>
<a href="creditos">
  <img src="https://user-images.githubusercontent.com/27809524/168382545-9105b8a1-08ca-4739-949a-2eae4a47bf7b.png">


  </a>
