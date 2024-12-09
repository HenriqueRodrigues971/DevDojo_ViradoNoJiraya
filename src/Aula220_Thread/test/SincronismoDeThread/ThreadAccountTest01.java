package Aula220_Thread.test.SincronismoDeThread;

import Aula220_Thread.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
	private Account account = new Account();

	public static void main(String[] args) {
		ThreadAccountTest01 threadAccountTest1 = new ThreadAccountTest01();
		Thread t1 = new Thread(threadAccountTest1, "Hestia");
		Thread t2 = new Thread(threadAccountTest1, "Bell Cranel");

		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withDrawal(10);
			if (account.getBalance() < 0) {
				System.out.println("FODEO");
			}

		}
	}

	private void withDrawal(int amount) {
		System.out.println(getThreadName() + "### fora do synchronized");
		synchronized (account) {
			System.out.println("### dentro do synchronized");
			if (account.getBalance() >= amount) {
				System.out.println (Thread.currentThread().getName() + " está indo sacar dinheiro");
				account.withDrawl(amount);

				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta "
						+ account.getBalance());
			} else {
				System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
			}
		}
	}

	private String getThreadName() {
		return Thread.currentThread().getName();
	}

}
