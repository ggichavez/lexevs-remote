/*******************************************************************************
 * Copyright: (c) 2004-2009 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 * 
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 *   
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *   
 *  		http://www.eclipse.org/legal/epl-v10.html
 * 
 *  		
 *******************************************************************************/
package org.LexGrid.LexBIG.caCore.interfaces;

import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.caCore.security.interfaces.TokenSecurableApplicationService;
import org.lexgrid.conceptdomain.LexEVSConceptDomainServices;
import org.lexgrid.valuesets.LexEVSPickListDefinitionServices;
import org.lexgrid.valuesets.LexEVSValueSetDefinitionServices;

/**
 * The Distributed LexEVS Portion of LexEVSAPI. This interface is a framework for calling
 * LexBIG API methods remotely, along with enforcing security measures.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public interface LexEVSDistributed extends TokenSecurableApplicationService, LexBIGService {
	
	public LexEVSValueSetDefinitionServices getLexEVSValueSetDefinitionServices();
	
	public LexEVSConceptDomainServices getLexEVSConceptDomainServices();
	
	public LexEVSPickListDefinitionServices getLexEVSPickListDefinitionServices();
}
