
public class ClassePrincipal {

	public static void main(String[] args) {
		ClasseFuncionario funcionarios= new ClasseFuncionario();
		funcionarios.setAtributoNomeFuncionario("João");
		funcionarios.setAtributoSalarioFuncionario(1800.00);
		ClasseSQL sql= new ClasseSQL();sql.salvarDados(funcionarios);
	}

}
