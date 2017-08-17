package fiap.scj.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fiap.scj.bean.Aluno;

@Namespace("/aluno")
public class AlunoAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 360201412957278120L;
	
	private Aluno aluno;
	private String mensagem;

	public AlunoAction() {
		aluno = new Aluno();
	}

	@Action(value = "/cadastrar", results = { @Result(name = "success", location = "/sucesso.jsp"),
			@Result(name = "error", location = "/error.jsp") })
	public String cadastrar() {
		System.out.println(this.aluno);
		this.mensagem = "Tudo certo com seu cadastro";
		return SUCCESS;
	}

	public Aluno getAluno() {
		return this.aluno;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}