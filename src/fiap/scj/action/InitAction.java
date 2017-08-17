package fiap.scj.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class InitAction extends ActionSupport {
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Action(value = "welcome", results = { @Result(name = "success", location = "/sucesso.jsp") })
	public String execute() throws Exception {
		this.mensagem = "Bem-vindo!";

		return SUCCESS;
	}
}
