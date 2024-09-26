package com.app.test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "FundingRoundInvestors")
@Table(schema = "\"test\"", name = "\"FundingRoundInvestors\"")
@Data
public class FundingRoundInvestors{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"RoundId\"")
	private Integer roundId;

    
    @Column(name = "\"InvestorId\"")
    private Integer investorId;
 
}