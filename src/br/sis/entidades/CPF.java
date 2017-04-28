package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class CPF {

    public String numero;

    public CPF(String numero) {
        try {
            this.setNumero( numero );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if( isValidSsn( numero)) {
            this.numero = numero;
        } else {
            throw new Exception("Valor de CPF inválido");
        }
    }

    public static int[] getWeightSsn() {
        return weightSsn;
    }

    // CPF
    private static final int[] weightSsn = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calculate(final String str, final int[] weight) {
        int sum = 0;
        for (int i = str.length() - 1, digit; i >= 0; i--) {
            digit = Integer.parseInt(str.substring(i, i + 1));
            sum += digit * weight[weight.length - str.length() + i];
        }
        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }

    /**
     * Valida CPF
     *
     * @param ssn
     * @return
     */
    public static boolean isValidSsn(final String ssn) {
        if ((ssn == null) || (ssn.length() != 11) || ssn.matches(ssn.charAt(0) + "{11}")) return false;

        final Integer digit1 = calculate(ssn.substring(0, 9), weightSsn);
        final Integer digit2 = calculate(ssn.substring(0, 9) + digit1, weightSsn);
        return ssn.equals(ssn.substring(0, 9) + digit1.toString() + digit2.toString());
    }

    @Override
    public String toString() {
        return "CPF{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
