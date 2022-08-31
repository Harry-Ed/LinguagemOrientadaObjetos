//comentário de linha

/*
Comentário
de
Bloco
 */
package linguagemorientadaobjeto;

public class LinguagemOrientadaObjeto {

    public static void main(String[] args) {

        //Lista 1
        // 1 - Faça um programa que declare uma variável inteira, inicialize-a com a sua idade e mostre-a.
        int i = 19;
        {
            System.out.println("Eu tenho " + i + " anos");
        }

//2 - Ler os valores de comprimento, largura e altura e apresentar o valor do volume de uma caixa retangular. Utilize para o cálculo a formula
//Volume = comprimento * largura * altura
//3 - Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12km por litro. Para obter o cálculo o usuário deve fornece o tempo gasto na viagem e a velocidade média durante ela.
//Dessa forma será possível obter a distância percorrida com a fórmula
//DISTANCIA = TEMPO * VELOCIDADE
//Tendo o valor da distância basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
//LITROS_USADOS = DISTANCIA /12
//O programa deve apresentar os valores da velocidade média, tempo gasto da viagem, a distância percorrida e a quantidade de litros utilizada.
//4 - Receba a altura e a largura e a partir dessa informação calcule a área o e perímetro de um retângulo, onde:
//área = base * altura
//perímetro = 2base + 2altura
//5 - Ler uma temperatura em graus Centígrados e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = (9*C+160)/5. Onde F é a temperatura em Fahrenheit e C é a temperatura em Centígrados.
//6 – Desenvolver um programa utilizando os conceitos de variáveis para resolver a expressão matemática abaixo sendo que o resultado é 125.
        double supEsq = Math.pow(6 * (3 + 2), 2) / (3 * 2);
        double supDir = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
        double sup = Math.pow((supEsq - supDir), 3);
        double result = sup / Math.pow(10, 3);
        System.out.println("Resultado: " + result);

        //Lista 2
        //1)	Faça um programa que leia 2 números e imprima uma mensagem dizendo se são iguais ou diferentes.
//2)	Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes).
//3)	Entrar com um número e informar se ele é divisível por 10, ou é divisível por 5, ou é divisível por 2 ou se não é divisível por nenhum destes.
//4)	Entrar com 5 números e mostrar na saída qual é o menor e qual e o maior número.
//5)	Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.
//6)	Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.
//7)	Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
//•	Não eleitor (abaixo de 16 anos)
//•	Eleitor obrigatório (entre 18 e 65 anos) 
//•	Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos) 
//8)	Ler um número entre 1 e 12, e escrever o mês correspondente.   Caso o usuário digite um número fora deste intervalo, deverá aparecer uma mensagem, informando que não existe mês com este número.
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Digite o número do mês desejado");
        mes = teclado.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("número inválido");
        }

//Lista 3
//1 - Ler três números e mostra-los em ordem do menor para o maior. O sistema pode aceitar números iguais
//2 -  Entrar com 20 números e imprimir a soma desses números.
//3 -  Entrar com 20 números e imprimir a soma dos positivos e o total de números negativos.
//4 - Faça um algoritmo que deixe escolher qual a tabuada de multiplicar que se deseja imprimir. 
//5 – Faça um programa onde você consiga jogar joquempô com o computador seguindo as seguintes regras:
//•	Crie um menu para que o jogador escolha uma dessas duas opções: 0 – Pedra | 1 – Papel | 2 – Tesoura
//•	O jogador deve escolher uma opção e o jogador também, após a escolha dos dois mostre a mensagem de quem ganhou
//•	O jogo deve acontecer 3 vezes e após o término das três partidas o programa deve mostrar o placar a avisar quem ganhou.
    }

}
