package org.palladiosimulator.experimentautomation.dsl.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.uka.ipd.sdq.identifier.Identifier;

public class DeclarativeQualifiedNameProviderForIdentifier extends DefaultDeclarativeQualifiedNameProvider {
	static int x = 0;
	
	public QualifiedName getFullyQualifiedName(final Identifier obj) {
		QualifiedName name = super.getFullyQualifiedName(obj);
		if(name == null) {
			name = QualifiedName.create(/*obj.getId()*/"TEST" + x);
			x++;
		}
		return name;
	}
}
