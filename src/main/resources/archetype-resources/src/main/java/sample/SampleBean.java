package sample;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SampleBean {

	@EJB
	private SampleEJB sampleEJB;

	public String getMessage() {
		return sampleEJB.getWelcomeMessage();
	}
}