package br.com.alura.screenmatch.desafios.github;

public class ErroConsultaGitHubException extends RuntimeException {
    private String msg;
    public ErroConsultaGitHubException(String mensagem) {
        this.msg = mensagem;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
