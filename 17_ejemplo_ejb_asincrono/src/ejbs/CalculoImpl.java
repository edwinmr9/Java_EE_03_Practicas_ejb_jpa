package ejbs;

import java.util.concurrent.Future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculoImpl
 */
@Stateless
public class CalculoImpl implements Calculo {

    
	@Asynchronous
	@Override
	public Future<Integer> sumaNumeros(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return new AsyncResult<>(res);
	}

}
