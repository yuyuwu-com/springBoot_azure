package com.yuyuwu.springdemo;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class controller_error implements ErrorController {

    private final ErrorAttributes errorAttributes;

    public controller_error(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping("/error")
    public String handleError(WebRequest request, Model model) {
        // Get the error status code (404, 500, etc.)
        Object status = request.getAttribute("javax.servlet.error.status_code", WebRequest.SCOPE_REQUEST);

        // Check the status code and return a custom message
        String errorMessage;
        if (status != null) {
            switch (status.toString()) {
                case "404":
                    errorMessage = "404 error, sorry about that! The page you're looking for doesn't exist.";
                    break;
                case "500":
                    errorMessage = "500 error, something went wrong on our end!";
                    break;
                default:
                    errorMessage = "An unexpected error occurred!";
                    break;
            }
        } else {
            errorMessage = "Unexpected error!";
        }

        // Pass the error message to the view
        model.addAttribute("errorMessage", errorMessage);

        return "error"; // This will render error.html with the error message
    }
}
