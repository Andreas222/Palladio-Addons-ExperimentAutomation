package org.palladiosimulator.experimentautomation.dsl.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Datasource;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.identifier.Identifier;

public class DeclarativeQualifiedNameProviderForEObject extends DefaultDeclarativeQualifiedNameProvider {
	static int x = 0;
	
	protected QualifiedName qualifiedName(Entity obj) {
		String entName = ((Entity)obj).getEntityName();
		if(entName != null && !(entName.isEmpty()) && !(entName.equals("aName"))) {
			return QualifiedName.create(entName);
		} else {
			return qualifiedName((Identifier)obj);
		}
	}
	
	protected QualifiedName qualifiedName(Identifier obj) {
		return QualifiedName.create(((Identifier)obj).getId());
	}
	
	protected QualifiedName qualifiedName(Datasource obj) {
		return QualifiedName.create(obj.getName());
	}
	
	protected QualifiedName qualifiedName(EObject obj) {
		QualifiedName name = QualifiedName.create(obj.eResource().getURI().appendFragment(obj.eResource().getURIFragment(obj)).toString());
		//QualifiedName name = QualifiedName.create("Object_" + x);
		//x++;
		return name;
	}
}
