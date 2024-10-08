package lu.crx.financing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest(properties = {"job.autorun.enabled=false"})
@Transactional
@TestPropertySource("classpath:application-test.properties")
public class BaseIT {
    @Autowired
    protected EntityManager entityManager;
}
