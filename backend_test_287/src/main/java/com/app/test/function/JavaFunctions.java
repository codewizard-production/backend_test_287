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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test.repository.FundingRoundRepository;
import com.app.test.repository.StageRepository;
import com.app.test.repository.DocumentRepository;
import com.app.test.repository.InvestorRepository;
import com.app.test.repository.FounderRepository;
import com.app.test.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
