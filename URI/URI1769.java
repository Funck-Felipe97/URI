import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cpf;
        
        while ((cpf = br.readLine()) != null) {
            List<Integer> vet = new ArrayList<>();
            for(int i = 0 ; i < cpf.length() ; ++i){
                if(cpf.charAt(i) != '.' && cpf.charAt(i) != '-'){
                    vet.add(Integer.valueOf(cpf.charAt(i)) - 48);
                }
            }
            
            int conta = 0;
            long contb = 0;
            long contc = 0;
            
            for(int e : vet){
                conta += e;
            }
            
            for(int i = 0 ; i < 9 ; ++i){
                contb += vet.get(i) * (i + 1);
            }
            
            int j = 0;
            for(int i = 8 ; i >= 0 ; --i){
                contc += vet.get(j) * (i + 1);
                j++;
            }
           
            if(((contb % 11) % 10) == vet.get(9) && ((contc % 11) % 10) == vet.get(10)){
                System.out.println("CPF valido");
            }else{
                System.out.println("CPF invalido");
            }
        }
    }
    
}
