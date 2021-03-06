/**
 */
package org.fuin.dsl.cqrs.cqrsDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fuin.dsl.cqrs.cqrsDSL.Command;
import org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl#getAcceptable <em>Acceptable</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends AbstractElementImpl implements Command
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected AbstractMethod target;

  /**
   * The cached value of the '{@link #getAcceptable() <em>Acceptable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptable()
   * @generated
   * @ordered
   */
  protected Duration acceptable;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CqrsDSLPackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMethod getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (AbstractMethod)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CqrsDSLPackage.COMMAND__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMethod basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(AbstractMethod newTarget)
  {
    AbstractMethod oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CqrsDSLPackage.COMMAND__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration getAcceptable()
  {
    return acceptable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptable(Duration newAcceptable, NotificationChain msgs)
  {
    Duration oldAcceptable = acceptable;
    acceptable = newAcceptable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CqrsDSLPackage.COMMAND__ACCEPTABLE, oldAcceptable, newAcceptable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptable(Duration newAcceptable)
  {
    if (newAcceptable != acceptable)
    {
      NotificationChain msgs = null;
      if (acceptable != null)
        msgs = ((InternalEObject)acceptable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CqrsDSLPackage.COMMAND__ACCEPTABLE, null, msgs);
      if (newAcceptable != null)
        msgs = ((InternalEObject)newAcceptable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CqrsDSLPackage.COMMAND__ACCEPTABLE, null, msgs);
      msgs = basicSetAcceptable(newAcceptable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CqrsDSLPackage.COMMAND__ACCEPTABLE, newAcceptable, newAcceptable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, CqrsDSLPackage.COMMAND__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CqrsDSLPackage.COMMAND__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CqrsDSLPackage.COMMAND__ACCEPTABLE:
        return basicSetAcceptable(null, msgs);
      case CqrsDSLPackage.COMMAND__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CqrsDSLPackage.COMMAND__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case CqrsDSLPackage.COMMAND__ACCEPTABLE:
        return getAcceptable();
      case CqrsDSLPackage.COMMAND__ATTRIBUTES:
        return getAttributes();
      case CqrsDSLPackage.COMMAND__MESSAGE:
        return getMessage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CqrsDSLPackage.COMMAND__TARGET:
        setTarget((AbstractMethod)newValue);
        return;
      case CqrsDSLPackage.COMMAND__ACCEPTABLE:
        setAcceptable((Duration)newValue);
        return;
      case CqrsDSLPackage.COMMAND__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case CqrsDSLPackage.COMMAND__MESSAGE:
        setMessage((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CqrsDSLPackage.COMMAND__TARGET:
        setTarget((AbstractMethod)null);
        return;
      case CqrsDSLPackage.COMMAND__ACCEPTABLE:
        setAcceptable((Duration)null);
        return;
      case CqrsDSLPackage.COMMAND__ATTRIBUTES:
        getAttributes().clear();
        return;
      case CqrsDSLPackage.COMMAND__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CqrsDSLPackage.COMMAND__TARGET:
        return target != null;
      case CqrsDSLPackage.COMMAND__ACCEPTABLE:
        return acceptable != null;
      case CqrsDSLPackage.COMMAND__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case CqrsDSLPackage.COMMAND__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
