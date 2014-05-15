package rtstreinamento;

public class DescontoCompra {
	public int calcularDesconto(int valorCompra) {
		int valorDesconto = 0;

		if (valorCompra >= 100 && valorCompra <= 200) {
			valorDesconto = 10;
		}

		if (valorCompra >= 200 && valorCompra < 300) {
			valorDesconto = 20;
		}

		if (valorCompra >= 300 && valorCompra < 400) {
			valorDesconto = 25;
		}

		if (valorCompra >= 400) {
			valorDesconto = 30;
		}
		return valorDesconto;
	}
}
