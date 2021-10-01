package DAW.lope.Pr3.Controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Pr3Controller {
	
	// Métodos para la Portada
	@RequestMapping(value="/Quiz", method=RequestMethod.GET)
	public String quiz_get() {

		return "PortadaQuiz";
	 }

	@RequestMapping(value="/Quiz", method=RequestMethod.POST)
	public String quiz_post() {

 		return "redirect:/Quiz1";
	 }
	
	// Métodos para la Primera pregunta
	@RequestMapping(value="/Quiz1", method=RequestMethod.GET)
	public String quiz1_get() {

		return "Quiz1";
	 }

	@RequestMapping(value="/Quiz1", method=RequestMethod.POST)
	public String quiz1_post(HttpSession session,
			@RequestParam (value = "accion", required = false) String Acc,
			@RequestParam (value = "aventura", required = false) String Avt,
			@RequestParam (value = "ciencia", required = false) String Cnf,
			@RequestParam (value = "fantasia", required = false) String Fan,
			@RequestParam (value = "suspense", required = false) String Sus,
			@RequestParam (value = "terror", required = false) String Ter) {
		
		// Guardar los datos en la session de los resultados obetenidos

		String accion = (String) session.getAttribute("accion");
		String aventura = (String) session.getAttribute("aventura");
		String ciencia = (String) session.getAttribute("ciencia");
		String fantasia = (String) session.getAttribute("fantasia");
		String suspense = (String) session.getAttribute("suspense");
		String terror = (String) session.getAttribute("terror");
		
		// Todo es codigo repetitivo es necesario para la correcta obtención de datos
		if (accion == null || aventura == null || ciencia == null || fantasia == null || suspense == null || terror == null) {

			if (Acc == null) {
				accion = "0";
			}
			else {
				accion = Acc;
			}
			if (Avt == null) {
				aventura = "0";
			}
			else {
				aventura = Avt;
			}
			if (Cnf == null) {
				ciencia = "0";
			}
			else {
				ciencia = Cnf;
			}
			if (Fan == null) {
				fantasia = "0";
			}
			else {
				fantasia = Fan;
			}
			if (Sus == null) {
				suspense = "0";
			}
			else {
				suspense = Sus;
			}
			if (Ter == null) {
				terror = "0";
			}
			else {
				terror = Ter;
			}

			session.setAttribute("accion", accion);
			session.setAttribute("aventura", aventura);
			session.setAttribute("ciencia", ciencia);
			session.setAttribute("fantasia", fantasia);
			session.setAttribute("suspense", suspense);
			session.setAttribute("terror", terror);
		}
		else {
			accion = Acc;
			session.setAttribute("accion", accion);
			aventura = Avt;
			session.setAttribute("aventura", aventura);
			ciencia = Cnf;
			session.setAttribute("ciencia", ciencia);
			fantasia = Fan;
			session.setAttribute("fantasia", fantasia);
			suspense = Sus;
			session.setAttribute("suspense", suspense);
			terror = Ter;
			session.setAttribute("terror", terror);
		}

 		return "redirect:/Quiz2";
	 }
	
	// Métodos para la Segunda pregunta
	@RequestMapping(value="/Quiz2", method=RequestMethod.GET)
	public String quiz2_get() {

		return "Quiz2";
	 }	

	@RequestMapping(value="/Quiz2", method=RequestMethod.POST)
	public String quiz2_post(HttpSession session,
			@RequestParam (value = "librosN", required = false) String Nar,
			@RequestParam (value = "librosFr", required = false) String Lir,
			@RequestParam (value = "librosDr", required = false) String Dra,
			@RequestParam (value = "librosDd", required = false) String Did) {
		
		// Guardar los datos en la session de los resultados obetenidos

		String narrativo = (String) session.getAttribute("narrativo");
		String lirico = (String) session.getAttribute("lirico");
		String dramatico = (String) session.getAttribute("dramatico");
		String didactico = (String) session.getAttribute("didactico");
				
		// Todo es codigo repetitivo es necesario para la correcta obtención de datos
		if (narrativo == null || lirico == null || dramatico == null || didactico == null) {

			if (Nar == null) {
				narrativo = "0";
			}
			else {
				narrativo = Nar;
			}
			if (Lir == null) {
				lirico = "0";
			}
			else {
				lirico = Lir;
			}
			if (Dra == null) {
				dramatico = "0";
			}
			else {
				dramatico = Dra;
			}
			if (Did == null) {
				didactico = "0";
			}
			else {
				didactico = Did;
			}

			session.setAttribute("narrativo", narrativo);
			session.setAttribute("lirico", lirico);
			session.setAttribute("dramatico", dramatico);
			session.setAttribute("didactico", didactico);
		}
		else {
			narrativo = Nar;
			session.setAttribute("narrativo", narrativo);
			lirico = Lir;
			session.setAttribute("lirico", lirico);
			dramatico = Dra;
			session.setAttribute("dramatico", dramatico);
			didactico = Did;
			session.setAttribute("didactico", didactico);
		}
		
		return "redirect:/Quiz3";
	}
	
	// Métodos para la Tercera pregunta
	@RequestMapping(value="/Quiz3", method=RequestMethod.GET)
	public String quiz3_get() {

		return "Quiz3";
	 }	

	@RequestMapping(value="/Quiz3", method=RequestMethod.POST)
	public String quiz3_post(HttpSession session,
			@RequestParam (value = "paisajes") String Pas) {
		
		// Guardar los datos en la session de los resultados obetenidos
		
		String paisajes = (String) session.getAttribute("paisajes");
		if (paisajes == null) {
			paisajes = Pas;
			session.setAttribute("paisajes", paisajes);
		}
		else {
			paisajes = Pas;
			session.setAttribute("paisajes", paisajes);
		}
		
		return "redirect:/Quiz4";
	}
	
	// Métodos para la Cuarta pregunta
	@RequestMapping(value="/Quiz4", method=RequestMethod.GET)
	public String quiz4_get() {

		return "Quiz4";
	 }	

	@RequestMapping(value="/Quiz4", method=RequestMethod.POST)
	public String quiz4_post(HttpSession session,
			@RequestParam (value = "animal") String Ani) {
		
		// Guardar los datos en la session de los resultados obetenidos
		
		String animal = (String) session.getAttribute("animal");
		if (animal == null) {
			animal = Ani;
			session.setAttribute("animal", animal);
		}
		else {
			animal = Ani;
			session.setAttribute("animal", animal);
		}

		return "redirect:/Quiz5";
	}
	
	// Métodos para la Quinta pregunta
	@RequestMapping(value="/Quiz5", method=RequestMethod.GET)
	public String quiz5_get() {

		return "Quiz5";
	 }	

	@RequestMapping(value="/Quiz5", method=RequestMethod.POST)
	public String quiz5_post (HttpSession session,
			@RequestParam (value = "compañero") String Comp) {
		
		// Guardar los datos en la session de los resultados obetenidos
		
		String compañero = (String) session.getAttribute("compañero");
		if (compañero == null) {
			if (Comp == null) {
				compañero = "0";
			}
			else {
				compañero = Comp;
			}
			session.setAttribute("compañero", compañero);
		}
		else {
			compañero = Comp;
			session.setAttribute("compañero", compañero);
		}

		return "redirect:/Quiz6";
	}
	
	// Métodos para la Sexta pregunta
	@RequestMapping(value="/Quiz6", method=RequestMethod.GET)
	public String quiz6_get() {

		return "Quiz6";
	 }	

	@RequestMapping(value="/Quiz6", method=RequestMethod.POST)
	public String quiz6_post(HttpSession session,
			@RequestParam (value = "raza") String Raz) {
		
		// Guardar los datos en la session de los resultados obetenidos
		
		String raza = (String) session.getAttribute("raza");
		if (raza == null) {
			if (Raz == null) {
				raza = "0";
			}
			else {
				raza = Raz;
			}
			
			session.setAttribute("raza", raza);
		}
		else {
			raza = Raz;
			session.setAttribute("raza", raza);
		}
				
		return "redirect:/Quiz7";
	}
	
	// Métodos para la Septima pregunta
	@RequestMapping(value="/Quiz7", method=RequestMethod.GET)
	public String quiz7_get() {

		return "Quiz7";
	 }	

	@RequestMapping(value="/Quiz7", method=RequestMethod.POST)
	public String quiz7_post(HttpSession session,
			@RequestParam (value = "hobbys") String Hob) {
		
		// Guardar los datos en la session de los resultados obetenidos
		
		String hobbys = (String) session.getAttribute("hobbys");
		if (hobbys == null) {
			hobbys = Hob;
			session.setAttribute("hobbys", hobbys);
		}
		else {
			hobbys = Hob;
			session.setAttribute("hobbys", hobbys);
		}
		
		return "redirect:/QuizResultados";
	}
	
	// Métodos para los resultados
	@RequestMapping(value="/QuizResultados", method=RequestMethod.GET)
	public String quizResultados_get(Model modelo, HttpSession session) {
		
		String valorAcc = (String) session.getAttribute("accion");
		String valorAvt = (String) session.getAttribute("aventura");
		String valorCnf = (String) session.getAttribute("ciencia");
		String valorFan = (String) session.getAttribute("fantasia");
		String valorSus = (String) session.getAttribute("suspense");
		String valorTer = (String) session.getAttribute("terror");
		
		int a,b,c,d,e,f;
		
		a = Integer.parseInt(valorAcc);
		b = Integer.parseInt(valorAvt);
		c = Integer.parseInt(valorCnf);
		d = Integer.parseInt(valorFan);
		e = Integer.parseInt(valorSus);
		f = Integer.parseInt(valorTer);
		
		int sumaP1 = a+b+c+d+e+f;
		
		
		modelo.addAttribute("accion", sumaP1);

		return "QuizResultados";
	 }

	@RequestMapping(value="/QuizResultados", method=RequestMethod.POST)
	public String quizResultados_post() {
		
		return "QuizResultados";
	}
}
