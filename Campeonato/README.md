PROJETO DE POO CAMPEONATO DE FUTEBOL 

vamos criar um programa em java onde vai simular um camponato de futebol onde: 
-> Todos os times se enfrentam em ida e volta
-> Uma vitoria vale 3 pontos e empate 1
-> O campeão é o time que fizer mais pontos na competição

 A classe Clube tem como atributos seu nome, seu número de pontos e seu saldo de
 gols. Os métodos ganhar, empatar e perder devem incrementar os pontos e o saldo de gols
 de acordo com as regras do campeonato.
 A classe Campeonato possui como atributo uma coleção de clubes. Nessa classe também
 temos o método jogarCampeonato que deverá fazer um arranjo da coleção de clubes 2 a 2,
 de forma que cada clube jogue com todos os outros clubes do campeonato em um jogo de
 ida e um jogo de volta. Para cada partida, o método jogarCampeonato deverá chamar seu
 método auxiliar jogarPartida, que irá sortear um placar como sendo dois inteiros entre 0 e 5
 representando a quantidade de gols que cada time marcou. Após esse sorteio, o método
 verifica o resultado, chamando os respectivos métodos para ganhar, empatar e perder dos
 dois clubes. Ao final da execução do campeonato, os métodos getClassificacao e
 getCampeao deverão ser chamados. O getClassificacao vai ordenar a coleção de clubes
 pela pontuação, utilizando o saldo de gols para desempate e retorna uma String que pode
 ser impressa na tela. 
 