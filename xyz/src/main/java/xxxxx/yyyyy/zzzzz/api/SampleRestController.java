package xxxxx.yyyyy.zzzzz.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xxxxx.yyyyy.zzzzz.domain.model.Sample;
import xxxxx.yyyyy.zzzzz.domain.service.SampleService;

@RequestMapping("/sample")
@RestController
public class SampleRestController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/")
    public Sample get() {
        return sampleService.service();
    }
}
