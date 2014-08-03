/**
 */
package org.palladiosimulator.experimentautomation.experiments.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsValueProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.experimentautomation.experiments.NestedIntervalsValueProvider}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class NestedIntervalsValueProviderItemProvider extends ValueProviderItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public NestedIntervalsValueProviderItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addMinValuePropertyDescriptor(object);
            this.addMaxValuePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Min Value feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMinValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_NestedIntervalsValueProvider_minValue_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_NestedIntervalsValueProvider_minValue_feature",
                        "_UI_NestedIntervalsValueProvider_type"),
                ExperimentsPackage.Literals.NESTED_INTERVALS_VALUE_PROVIDER__MIN_VALUE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Max Value feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMaxValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_NestedIntervalsValueProvider_maxValue_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_NestedIntervalsValueProvider_maxValue_feature",
                        "_UI_NestedIntervalsValueProvider_type"),
                ExperimentsPackage.Literals.NESTED_INTERVALS_VALUE_PROVIDER__MAX_VALUE, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns NestedIntervalsValueProvider.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/NestedIntervalsValueProvider"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final NestedIntervalsValueProvider nestedIntervalsValueProvider = (NestedIntervalsValueProvider) object;
        return this.getString("_UI_NestedIntervalsValueProvider_type") + " "
        + nestedIntervalsValueProvider.getMinValue();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(NestedIntervalsValueProvider.class)) {
        case ExperimentsPackage.NESTED_INTERVALS_VALUE_PROVIDER__MIN_VALUE:
        case ExperimentsPackage.NESTED_INTERVALS_VALUE_PROVIDER__MAX_VALUE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}