@Inline
public ObjectReference objectReferenceRead(
  ObjectReference src,
  Address slot)
{
  ObjectReference value;
  value = slot.loadObjectReference;
  /* barrier-specific code here */
  return value;
}
