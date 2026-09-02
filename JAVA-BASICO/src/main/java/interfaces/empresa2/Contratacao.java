package interfaces.empresa2;

import interfaces.empresa.Funcionario;

public interface Contratacao {
    void admitir(interfaces.empresa.Funcionario funcionario);
    void demitir(Funcionario funcionario);
}
