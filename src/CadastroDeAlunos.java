import java.util.Scanner;
public class CadastroDeAlunos {
    static int contaAlunosCadastrados = 0; 
    public static void main(String[] args) {
        int opcao =0 ;
        String[][] alunos  = new String[2][2];

        	do {
			opcao = menuInicial();
			switch(opcao) {
				case 1:{
					cadastroDeAluno(alunos);
					break;
				}
				
				case 2: {	
					editarCadastro(alunos);
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
		
        

        if(!existeEspacoNaBaseDedados(alunos)) {
			System.out.println("base de dados cheia, não é possivel cadastrar");
			return alunos;
		}

        
		do{
			
            String nome = lerDados("Digite o nome do aluno");
            String matricula = lerDados("Atribua um numero de matricula");
            if(nome == null || matricula == null){
                System.out.println("preencha os campos com dados válidos\n");
            };
		
        }while();

		
		for(int i = 0;i<alunos
			.length;i++) {
			String aluno[] = alunos[i];
			if(aluno[0] == null) {
				alunos[i] = new String[2];
				alunos[i][0]=matricula;
				alunos[i][1]=nome;
	
				break;
			}
		}
		contaAlunosCadastrados++;
		return alunos;
	}

    public static boolean existeEspacoNaBaseDedados(String usuarios[][]) {
		int maximoArmazenamento = 2;
		return contaAlunosCadastrados < maximoArmazenamento;
	}
    public static String  lerDados(String menssagem){
        Scanner scanner = new Scanner(System.in);
        String input;
		System.out.println(menssagem);
		input = scanner.nextLine();
        return input;

    }


    public static String[][] editarCadastro(String alunos[][]){

		String matricula = lerDados("Digite a matricula do aluno que deseja editar");
		for(int i = 0;i<alunos.length;i++) {
			String aluno[] = alunos[i];
			if(aluno[0] != null && aluno[0].equals(matricula)) {
				String nome = lerDados("Digite o novo nome do aluno");
				alunos[i][1] = nome;
				System.out.println("Cadastro editado com sucesso");
				break;
			}
		}
		return alunos;
	}
}
