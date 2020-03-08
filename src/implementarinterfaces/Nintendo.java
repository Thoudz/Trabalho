/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarinterfaces;

/**
 *
 * @author joaom
 */
public class Nintendo extends Empresa implements InterfaceAcessorios, InterfaceConsole, InterfaceControle{

    public Nintendo(String nome, String cnpj, String slogan) {
        super(nome, cnpj, slogan);
    }

    @Override
    public String criarAcessoriosNintendoSwitch() {
        return "Construindo Acessorios do Nintendo Switch.... Os acessorios foram feitos com sucesso";
    }

    @Override
    public String criarNintendoSwitch() {
        return "Construindo Nintendo Switch.... O Console foi feito com sucesso";
    }

    @Override
    public String criarControleNintendoSwitch() {
        return "Construindo Controles do Nintendo Switch.... Os controles foram feitos com sucesso";
    }
    

    
}
