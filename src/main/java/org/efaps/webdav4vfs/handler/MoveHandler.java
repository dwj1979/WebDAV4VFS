/*
 * Copyright 2003 - 2010 The eFaps Team
 * Copyright 2007 Matthias L. Jugel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Revision:        $Rev$
 * Last Changed:    $Date$
 * Last Changed By: $Author$
 */

package org.efaps.webdav4vfs.handler;

import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemException;

/**
 * @author Matthias L. Jugel
 * @version $Id$
 */
public class MoveHandler
    extends AbstractCopyMoveBaseHandler
{
    @Override()
    protected void copyOrMove(final FileObject _object,
                              final FileObject _target,
                              final int _depth)
        throws FileSystemException
    {
        _object.moveTo(_target);
    }
}
