package com.app.test.function;

import com.app.test.model.Stage;
import com.app.test.model.Startup;
import com.app.test.model.FundingRound;
import com.app.test.model.Founder;
import com.app.test.model.Document;
import com.app.test.model.Investor;




import com.app.test.enums.RoundStatus;
import com.app.test.enums.StageName;
import com.app.test.converter.StageNameConverter;
import com.app.test.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  