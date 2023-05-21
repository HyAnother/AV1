import javax.swing.JOptionPane;

public class AppBanco {
    public static void main(String[] args) throws Exception {
        String nome[] = new String[100];
        int ano[] = new int[100], m = 0, menu;
        double saldo[] = new double[100];
        double numero[] = new double[100];
        double saque, deposito, confirma;

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a opção desejada:\n\n1. Cadastrar Conta\n2. Alterar Conta\n3. Listar Conta/Saldo\n4. Excluir Conta\n5. Depósito\n6. Saque\n7. Encerrar"));

            switch (menu) {

                case 1:

                    for (int i = 0; i < 1; i++) {

                        nome[i] = JOptionPane.showInputDialog("Insira seu nome completo: ");

                    }

                    for (int i = 0; i < 1; i++) {

                        numero[i] = Double.parseDouble(
                                JOptionPane.showInputDialog("Insira o número de sua conta, " + nome[i] + ":"));
                    }

                    for (int i = 0; i < 1; i++) {

                        ano[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Insira o ano de criação da conta, " + nome[i] + ":"));

                    }

                    for (int i = 0; i < 1; i++) {

                        saldo[i] = Double
                                .parseDouble(JOptionPane.showInputDialog("Insira seu saldo atual, " + nome[i] + ":"));

                    }

                    JOptionPane.showMessageDialog(null, "Conta registrada com sucesso!");
                    break;

                case 2:

                    if (nome[0] == null) {

                        JOptionPane.showMessageDialog(null, "Não há contas cadastradas!");
                        break;

                    }

                    for (int i = 0; i < 1; i++) {

                        nome[i] = JOptionPane.showInputDialog("Insira seu nome completo: ");

                    }

                    for (int i = 0; i < 1; i++) {

                        ano[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Insira o ano de criação da conta, " + nome[i] + ":"));

                    }

                    JOptionPane.showMessageDialog(null, "Conta alterada com sucesso!");
                    break;

                case 3:

                    if (nome[0] == null) {

                        JOptionPane.showMessageDialog(null, "Não há contas cadastradas!");

                    }

                    for (int i = 0; i < 1; i++) {

                        JOptionPane.showMessageDialog(null, "Nome: " + nome[m] + "\nNumero: " + numero[m]
                                + "\nAno de Criação: " + ano[m] + "\nSaldo: " + saldo[m] + "R$");

                    }
                    break;

                case 4:

                    if (nome[0] == null) {

                        JOptionPane.showMessageDialog(null, "Não há contas cadastradas!");
                        break;

                    }

                    if (saldo[0] != 0) {

                        JOptionPane.showMessageDialog(null, "Não é possível deletar uma conta com saldo!");
                        break;

                    }

                    nome[m] = null;
                    numero[m] = 0;
                    ano[m] = 0;
                    saldo[m] = 0;

                    JOptionPane.showMessageDialog(null, "Conta deletada com sucesso!");
                    break;

                case 5:

                    if (nome[0] == null) {

                        JOptionPane.showMessageDialog(null, "Não há contas cadastradas!");
                        break;

                    }

                    confirma = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de sua conta: "));

                    if (confirma != numero[0]) {

                        JOptionPane.showMessageDialog(null, "Conta Incorreta!");
                        break;

                    }

                    for (int i = 0; i < 1; i++) {

                        deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado: "));

                        saldo[i] = deposito + saldo[m];

                    }

                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    break;

                case 6:

                    if (nome[0] == null) {

                        JOptionPane.showMessageDialog(null, "Não há contas cadastradas!");
                        break;

                    }

                    confirma = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de sua conta: "));

                    if (confirma != numero[0]) {

                        JOptionPane.showMessageDialog(null, "Conta Incorreta!");
                        break;

                    }

                    for (int i = 0; i < 1; i++) {

                        saque = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser sacado: "));

                        if (saque > saldo[m]) {

                            JOptionPane.showMessageDialog(null, "Não há saldo suficiente para realizar esta operação!");
                            break;

                        }

                        saldo[i] = saldo[m] - saque;

                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    }
                    break;

                case 7:

                    JOptionPane.showMessageDialog(null, "Até logo!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida.");

            }

        } while (menu != 7);

    }
}