package bubolo.world;

import java.util.UUID;

/** A StationaryElement is a StationaryEntity that can take Damage and take
 * actions in the game world.
 * 
 * @author BU CS673 - Clone Productions
 */
public abstract class StationaryElement extends StationaryEntity implements Damageable
{
	/**
	 * Used in serialization/de-serialization.
	 */
	private static final long serialVersionUID = -1849311149500334067L;
	
	/**
	 * Construct a new StationaryElement with a random UUID.
	 */
	public StationaryElement()
	{
		super();
	}

	/**
	 * Construct a new StationaryElement with the specified UUID.
	 * 
	 * @param id
	 *            is the existing UUID to be applied to the new StationaryElement.
	 */
	public StationaryElement(UUID id)
	{
		super(id);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Construct a new StationaryElement with the given initial parameters and a random UUID.
	 * 
	 * @param x
	 *            is the initial x position in world coordinates.
	 * @param y
	 *            is the initial y position in world coordinates.
	 * @param w
	 *            is the initial width in world coordinates.
	 * @param h
	 *            is the initial height in world coordinates.
	 * @param rot
	 *            is the initial rotation in radians.
	 */
	public StationaryElement(float x, float y, int w, int h, float rot)
	{
		super(x, y, w, h, rot);
	}

	/**
	 * Construct a new StationaryElement with the given initial parameters and the specified UUID.
	 * 
	 * @param id
	 *            is the existing UUID to be applied to the new StationaryElement.
	 * @param x
	 *            is the initial x position in world coordinates.
	 * @param y
	 *            is the initial y position in world coordinates.
	 * @param w
	 *            is the initial width in world coordinates.
	 * @param h
	 *            is the initial height in world coordinates.
	 * @param rot
	 *            is the initial rotation in radians.
	 */
	public StationaryElement(float x, float y, int w, int h, float rot, UUID id)
	{
		super(x, y, w, h, rot, id);
	}

	@Override
	public int getHP()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxHP()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyHP()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAlive()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	//TODO: Add StationaryElement functionality!
}
