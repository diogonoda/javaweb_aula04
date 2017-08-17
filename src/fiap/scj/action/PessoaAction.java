package fiap.scj.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fiap.scj.bean.Pessoa;

@Namespace("/pessoa")
public class PessoaAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 360201412957278120L;
	
	private Pessoa pessoa;
	private String mensagem;

	public PessoaAction() {
		pessoa = new Pessoa();
	}

	@Action(value = "/cadastrar", results = { @Result(name = "success", location = "/sucesso.jsp"),
			@Result(name = "error", location = "/error.jsp") })
	public String cadastrar() {
		System.out.println(this.pessoa);
		this.mensagem = "Tudo certo com seu cadastro";
		return SUCCESS;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}