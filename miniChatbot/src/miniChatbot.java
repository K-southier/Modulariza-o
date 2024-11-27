import java.util.Scanner;

public class miniChatbot{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo: ");

        String input = scanner.nextLine();
        String resposta = analisarPergunta(input);

        System.out.println(resposta);

    }

    public static String analisarPergunta(String input){
        if (input.equalsIgnoreCase("Olá" )){
            return "Olá, como posso te ajudar?";
        } else if (input.equalsIgnoreCase("Qual é seu nome?")){
            return "Meu nome é MiniChatbot";
        } else if (input.equalsIgnoreCase("Como você está")){
            return "Estou funcionando perfeitamente, obrigado!";
        } else {
            return "Desculpe, não entendi sua pergunta. Pode reformular?";
        }

    }}



