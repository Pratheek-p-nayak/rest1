package pkg1.universities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UnivController {
	@Autowired
	UnivRepo ur;

	@PostMapping("/university/add")
	public String addUniversity(@RequestBody UnivEntity ue) {
		ur.save(ue);
		return "Inserted Successfully";
	}

	@GetMapping("/university/getAll")
	public List<UnivEntity> getMethodName() {
		return ur.findAll();
	}

	@GetMapping("/university/get/{id}")
	public Optional<UnivEntity> getMethodName(@PathVariable int id) {
		return ur.findById(id);
	}

}
