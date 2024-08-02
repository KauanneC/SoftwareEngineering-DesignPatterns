package adapter;

public class Client {

	public static void main(String[] args) {
		MPay clientPay = new MpayImpl();
		clientPay.setCustomerName("Nome do Cliente");
		clientPay.setCreditCardNo("Número do Cartão de Crédito");;
		clientPay.setCardExpMonth("Mês de Vencimento");
		clientPay.setCardCVVNo((short)123);
		clientPay.setAmount(500.0);
		
		PPay paymentsAdapter = new PaymentsAdapter(clientPay);
		testPPay(paymentsAdapter);
	}
	
	public static void testPPay(PPay pp){
		System.out.println(pp.getCardOwnerName());
		System.out.println(pp.getCustCardNo());
		System.out.println(pp.getCardExpMonthDate());
		System.out.println(pp.getCVVNo());
		System.out.println(pp.getTotalAmount());
	}

}
