package Model;

public class UsuarioBEAN {
    
    private int codigo_usuario;
    private String email_usuario;
    private String senha_usuario;
    private int status_usuario;

    public UsuarioBEAN() {
        this.codigo_usuario = 0;
        this.email_usuario = null;
        this.senha_usuario = null;
        this.status_usuario = 0;
    }

    public UsuarioBEAN(int codigo_usuario, String email_usuario, String senha_usuario, int status_usuario) {
        this.codigo_usuario = codigo_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        this.status_usuario = status_usuario;
    }

    public UsuarioBEAN(String email_usuario, String senha_usuario, int status_usuario) {
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        this.status_usuario = status_usuario;
    }

    public int getCodigo() {
        return codigo_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getSenha() {
        return senha_usuario;
    }

    public void setSenha(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public int getStatus_usuario() {
        return status_usuario;
    }

    public void setStatus_usuario(int status_usuario) {
        this.status_usuario = status_usuario;
    }
    
    
}
