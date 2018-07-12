package org.palladiosimulator.experimentautomation.dsl.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.identifier.Identifier;

public class DeclarativeQualifiedNameProviderForIdentifier extends DefaultDeclarativeQualifiedNameProvider {
	static int x = 0;
	
	public QualifiedName qualifiedName(final Identifier obj) {
		QualifiedName name = QualifiedName.create(obj.getId());
		if(obj instanceof Entity) {
			String entName = ((Entity)obj).getEntityName();
			if(entName != null && !(entName.isEmpty()) && !(entName.equals("aName"))) {
				name = QualifiedName.create(entName);
			}
		}
		return name;
	}
}
