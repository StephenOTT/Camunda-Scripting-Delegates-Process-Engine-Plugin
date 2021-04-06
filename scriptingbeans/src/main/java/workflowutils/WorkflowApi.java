package workflowutils;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;

public interface WorkflowApi {
    default ResponseEntity<Object> handleRequest(HttpServletRequest request){
        if (request.getMethod().equals(HttpMethod.GET.name())){
            return handleGet(request);
        } else if (request.getMethod().equals(HttpMethod.POST.name())){
            return handlePost(request);
        }  else if (request.getMethod().equals(HttpMethod.PUT.name())){
            return handlePost(request);
        }  else if (request.getMethod().equals(HttpMethod.PATCH.name())){
            return handlePost(request);
        }  else if (request.getMethod().equals(HttpMethod.DELETE.name())){
            return handlePost(request);
        }  else if (request.getMethod().equals(HttpMethod.HEAD.name())){
            return handlePost(request);
        }  else if (request.getMethod().equals(HttpMethod.OPTIONS.name())){
            return handlePost(request);
        }  else if (request.getMethod().equals(HttpMethod.TRACE.name())){
            return handlePost(request);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
        }
    }

    default ResponseEntity<Object>  handleGet(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handlePost(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handlePut(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handlePatch(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handleDelete(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handleHead(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handleOptions(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

    default ResponseEntity<Object>  handleTrace(HttpServletRequest request){
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Currently not implemented");
    }

}