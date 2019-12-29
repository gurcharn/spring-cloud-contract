package application.server;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endpoint")
public class Controller {

  @GetMapping
  public Modal getModal() {
    return new Modal("id", "name", "description");
  }

  @PostMapping
  public void createModal(@RequestBody Modal modal) {
    validateModal(modal);
  }

  private void validateModal(Modal modal) {
    validateString(modal.getName(), "name");
    validateString(modal.getDescription(), "description");
  }

  private void validateString(String value, String field){
    if (value == null) {
      throw new ModalValidationException("Invalid field - " + field);
    } else if (value.isEmpty()) {
      throw new ModalValidationException("Invalid field - " + field);
    } else if (value.trim().isEmpty()){
      throw new ModalValidationException("Invalid field - " + field);
    }
  }
}
