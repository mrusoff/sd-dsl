package fr.telintrans.model.utils;

import java.util.List; 

import java.util.Collection;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EPackage;

public class ConverterUtil
{
  public static class EPackageList extends UniqueEList.FastCompare<EPackage>
  {
    private static final long serialVersionUID = 1L;

    public EPackageList()
    {
      super();
    }

    public EPackageList(Collection<? extends EPackage> collection)
    {
      super(collection);
    }

    public EPackageList(int initialCapacity)
    {
      super(initialCapacity);
    }

    @Override
    protected Object[] newData(int capacity)
    {
      return new EPackage [capacity];
    }
  }
  public static String getQualifiedName(EPackage ePackage)
  {
    if (ePackage == null)
    {
      return null;
    }
    else
    {
      StringBuffer label = new StringBuffer(ePackage.getName());
      EPackage parentEPackage = ePackage.getESuperPackage();
      while (parentEPackage != null)
      {
        label.insert(0, ".").insert(0, parentEPackage.getName());
        parentEPackage = parentEPackage.getESuperPackage();
      }
      return label.toString();
    }
  }
}