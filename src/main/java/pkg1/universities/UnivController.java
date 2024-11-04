package pkg1.universities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivController {
	@Autowired
	UnivRepo ur;
	
	@PostMapping("/university/add")
	public String addUniversity(@RequestBody UnivEntity ue) {
		ur.save(ue);
		return "Inserted Successfully";
	}
}
