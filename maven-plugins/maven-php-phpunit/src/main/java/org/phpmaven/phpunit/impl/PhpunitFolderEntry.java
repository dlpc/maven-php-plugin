/**
 * Copyright 2010-2012 by PHP-maven.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.phpmaven.phpunit.impl;

import java.io.File;

import org.phpmaven.phpunit.IPhpunitEntry;

/**
 * A folder entry for phpunit requests.
 * 
 * @author Martin Eisengardt <Martin.Eisengardt@googlemail.com>
 * @since 2.0.0
 */
public class PhpunitFolderEntry implements IPhpunitEntry {

    /**
     * Folder.
     */
    private final File file;
    
    /**
     * Constructor to create a new folder entry.
     * @param file the folder.
     */
    public PhpunitFolderEntry(File file) {
        this.file = file;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntryType getType() {
        return EntryType.FOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File getFile() {
        return this.file;
    }

}
