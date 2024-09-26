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

@Entity(name = "InvestorInvestmentPreferences")
@Table(schema = "\"test\"", name = "\"InvestorInvestmentPreferences\"")
@Data
public class InvestorInvestmentPreferences{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InvestorId\"")
	private Integer investorId;

    
    @Column(name = "\"InvestmentPreferences\"")
    private Integer investmentPreferences;
}