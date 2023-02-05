package livejavaspring.appweb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import livejavaspring.appweb.entity.livejavaspringEntity;
import livejavaspring.appweb.repository.livejavaspringRepository;

@Controller
@RequestMapping("/")
public class livejavaspringController {

    private livejavaspringRepository _livejavaspringRepository;

    @Autowired
    public livejavaspringController(livejavaspringRepository _livejavaspringRepository){
        this._livejavaspringRepository = _livejavaspringRepository;
    }

    
    @RequestMapping(value = "/{titulo}", method = RequestMethod.GET)
    public String listlivejavaspring(@PathVariable("titulo") String titulo, ModelAndView mav){
        List<livejavaspringEntity> listlivejavaspring = _livejavaspringRepository.findByTitulo(titulo);
        if(listlivejavaspring != null){
            mav.addObject("listlivejavaspringentity", listlivejavaspring);
        }
        return "listlivejavaspring";
    }

    @RequestMapping(value = "/{titulo}", method = RequestMethod.POST)
	public String addToReadingList(@PathVariable("titulo") String titulo, livejavaspringEntity livejavaspringEntity) {
        livejavaspringEntity.setTitulo();
        _livejavaspringRepository.save(livejavaspringEntity);
		return "redirect:/{titulo}";
    }
}