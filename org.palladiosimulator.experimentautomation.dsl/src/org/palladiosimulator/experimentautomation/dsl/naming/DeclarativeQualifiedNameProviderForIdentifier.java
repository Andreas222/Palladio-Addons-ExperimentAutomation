package org.palladiosimulator.experimentautomation.dsl.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.identifier.Identifier;

public class DeclarativeQualifiedNameProviderForIdentifier extends DefaultDeclarativeQualifiedNameProvider {
	protected QualifiedName qualifiedName(final Entity obj) {
		String entName = ((Entity)obj).getEntityName();
		if(entName != null && !(entName.isEmpty()) && !(entName.equals("aName"))) {
			return QualifiedName.create(entName);
		} else {
			return QualifiedName.create(obj.getId());
		}
	}
	
	protected QualifiedName qualifiedName(final Identifier obj) {
		return QualifiedName.create(obj.getId());
	}
}
