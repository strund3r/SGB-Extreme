
import java.util.List;

public class Validacao{

    private String cpf;
    private String fone;
    
    private static List<Integer> movel;
    private static List<Integer> fixo;

    public void cpf(String cpf) throws Exception {
        this.cpf = cpf.replaceAll("[^0-9]", "");//Remove tudo o que não é dígito
        int soma = 0;
        int resto;
        if (this.cpf == "00000000000"){
            throw new Exception("Número invalido");
        }

        for (int i=1; i<=9; i++){
            soma += Integer.parseInt(this.cpf.substring(i-1, i)) * (11 - i);
        }
        resto = (soma * 10) % 11;

        if ((resto == 10) || (resto == 11)){
            resto = 0;
        }
        if (resto != Integer.parseInt(this.cpf.substring(9, 10))){
            throw new Exception("Número invalido");
        }

        soma = 0;
        for (int i = 1; i <= 10; i++){
            soma += Integer.parseInt(this.cpf.substring(i-1, i)) * (12 - i);
        }

        resto = (soma * 10) % 11;

        if ((resto == 10) || (resto == 11)){
            resto = 0;
        }
        if (resto != Integer.parseInt(this.cpf.substring(10, 11))){
            throw new Exception("Número invalido");
        }
    }

    public void fone(String fone) throws Exception {
        this.fone = fone.replaceAll("[^0-9]", "");
        
        fixo.add(2);
        fixo.add(3);
        fixo.add(4);
        fixo.add(5);

        movel.add(6);
        movel.add(7);
        movel.add(8);
        movel.add(9);
        
        //verifica se tem a quantidade de numeros correta
        if(!(this.fone.length() >= 10 && this.fone.length() <= 11)) {
            throw new Exception("O número não contem a quantidade correta");
        }
        //Verifica se o DDD é válido
        if(Integer.parseInt(this.fone.substring(0, 1)) == 0 || Integer.parseInt(this.fone.substring(1, 2)) == 0) {
            throw new Exception("DDD invalido");
        }
        //Se tiver 11 caracteres, verificar se começa com 9
        if(this.fone.length() == 11 && Integer.parseInt(this.fone.substring(2, 3)) != 9) {
            throw new Exception("Necessário digito 9 depois do DDD");
        }
        //Se tiver 11 caracteres, verifica se o 4° digito está correto
        if(this.fone.length() == 11 && movel.indexOf(Integer.parseInt(this.fone.substring(3, 4))) == -1){
            throw new Exception("Numero invalido");
        }
        //Se tiver 10 caracteres, verifica se o 3° digito está correto
        if(this.fone.length() == 10 && fixo.indexOf(Integer.parseInt(this.fone.substring(2, 3))) == -1){
            throw new Exception("Numero invalido");
        }
    }
}