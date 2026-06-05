<<<<<<< HEAD
package Projeto;

public class EscolherConvertor {
   private ConvertorUnidades conv;
	
   public void setConvertor(ConvertorUnidades conv) {
        this.conv= conv;
    }

    public double realizarCalculo(double temp) {
        if (conv == null) {
            throw new IllegalStateException("Conversão não definida.");
        }
        return conv.converter(temp);
    }
}
=======
package Projeto;

public class EscolherConvertor {
   private ConvertorUnidades conv;
	
   public void setConvertor(ConvertorUnidades conv) {
        this.conv= conv;
    }

    public double realizarCalculo(double temp) {
        if (conv == null) {
            throw new IllegalStateException("Conversão não definida.");
        }
        return conv.converter(temp);
    }
}
>>>>>>> 4e40235 (Codigo atualizado)
