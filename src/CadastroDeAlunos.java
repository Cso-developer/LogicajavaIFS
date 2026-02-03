import java.util.Scanner;
public class CadastroDeAlunos {
    static int contaAlunosCadastrados = 0; 
    public static void main(String[] args) {
        int opcao =0 ;
        String[][] alunos  = new String[3][2];

        	do {
			opcao = menuInicial();
			switch(opcao) {
				case 1:{
					cadastroDeAluno(alunos)
					break;
				}
				
				case 2: {	
					
					break;
				}
						
				case 3: {
					
					break;
				}
				case 4: {
					
					break;
				}
				case 5: {
					
					break;
				}
					
					
				
			}
			
		}while(opcao !=0);
       
    }

    public static int menuInicial(){
        System.out.println("______________________________________");
		System.out.println("___________Escolha uma opção__________");
		System.out.println("----Digite 0- Encerrar----------------");
		System.out.println("----Digite 1- Cadastrar Aluno---------");
        System.out.println("----Digite 2- Editar Aluno Cadastrado-");
        System.out.println("----Digite 3- Excluir cadastrado------");
		System.out.println("----Digite 4- Buscar Aluno -----------");
		System.out.println("----Digite 5- Buscar Todos -----------");
		System.out.println("______________________________________");
        return  Integer.parseInt(lerDados(""));
	}
    
    public static String[][] cadastroDeAluno(String alunos[][]){
        boolean campoVazio = (nome == null || matricula == null)?true:false
        if(!existeEspacoNaBaseDedados(alunos)) {
			System.out.println("base de dados cheia, não é possivel cadastrar");
			return alunos;
		}
        do{
            String nome = lerDados("Digite o nome do aluno");
            String matricula = lerDados("Atribua um numero de matricula")
            if(campoVazio){
                System.out.println("preencha os campos com dados válidos")
            }
        }while(campoVazio)
        

        return alunos;
    }
    public static boolean existeEspacoNaBaseDedados(String usuarios[][]) {
		int maximoArmazenamento = 2;
		return contaAlunosCadastrados < maximoArmazenamento;
    public static String  lerDados(String menssagem){
        Scanner scanner = new Scanner(System.in);
        String input;
		System.out.println(mensagem);
		input = scanner.nextLine();
    }
    
}
